package com.tencent.benchmark.Controller;

import com.tencent.benchmark.Serivce.BenchmarkServices;
import com.tencent.benchmark.model.Benchmark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BenchmarkController {
    @Autowired
    BenchmarkServices benchmarkServices;

    @RequestMapping("/")
    public String Benchmark(){
        Benchmark bm = benchmarkServices.getBenchmark(14);

        return bm.getCarName();
    }
}
