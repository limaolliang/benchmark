package com.tencent.benchmark.Serivce;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.tencent.benchmark.mapper.BenchmarkMapper;
import com.tencent.benchmark.model.Benchmark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BechmarkServicesImpl implements BenchmarkServices {

    @Autowired
    BenchmarkMapper benchmarkMapper;


    @Override
    public Benchmark getBenchmark(int id){
        Benchmark bm = benchmarkMapper.selectByPrimaryKey(id);
        return bm;
    }

    public List<Benchmark> getAll(){

        List<Benchmark> list = benchmarkMapper.selectAll();
        return list;
    }

}

