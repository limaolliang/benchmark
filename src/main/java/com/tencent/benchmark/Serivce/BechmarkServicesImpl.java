package com.tencent.benchmark.Serivce;

import com.tencent.benchmark.mapper.BenchmarkMapper;
import com.tencent.benchmark.model.Benchmark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BechmarkServicesImpl implements BenchmarkServices {

    @Autowired
    BenchmarkMapper benchmarkMapper;


    @Override
    public Benchmark getBenchmark(int id){
        Benchmark bm = benchmarkMapper.selectByPrimaryKey(id);
        return bm;
    }
}

