package com.company.ch06_concurrent_api;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Collectors;

public class ForkJoin_DirSize extends RecursiveTask<Long> {

    private final Path path;

    public ForkJoin_DirSize(Path path) {
        this.path = path;
    }

    @Override
    protected Long compute() {
        long fileSize = 0;

        if(Files.isDirectory(path)){
            try{
                List<Path> fileList = Files.list(path).collect(Collectors.toList());
                List<ForkJoin_DirSize> subTaskList = new ArrayList<>();

                for(Path file : fileList){
                    ForkJoin_DirSize subTask = new ForkJoin_DirSize(file);
                    subTask.fork();
                    subTaskList.add(subTask);
                }

                Long subSize = 0L;

                for(ForkJoin_DirSize subTask : subTaskList){
                    subSize += subTask.join();
                }

                return subSize;
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            try{
                fileSize = Files.size(path);
            }
            catch (IOException e){
                System.out.println("Error : " + path);
            }
        }
        return fileSize;
    }

    public static void main(String[] args) {
        Path rootPath = Paths.get("C:\\git");
        ForkJoinPool pool = new ForkJoinPool();
        System.out.printf("병럴 처리 크기 : %s\n", pool.getParallelism());
        System.out.printf("합계 : %s", pool.invoke(new ForkJoin_DirSize(rootPath)));
    }
}
