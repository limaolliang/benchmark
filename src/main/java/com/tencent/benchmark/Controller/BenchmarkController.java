package com.tencent.benchmark.Controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.tencent.benchmark.Serivce.BenchmarkServices;
import com.tencent.benchmark.model.Benchmark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BenchmarkController {
    @Autowired
    BenchmarkServices benchmarkServices;

    @RequestMapping("/")
    public String Benchmark(){
        Benchmark bm = benchmarkServices.getBenchmark(14);
        return bm.getCarName();
    }

    @RequestMapping("/all")
    public String getAll(){
        List<Benchmark> list = benchmarkServices.getAll();
        String ret = JSON.toJSONString(list);
        return ret;
    }
}
