package com.tencent.benchmark.Serivce;

import com.tencent.benchmark.model.Benchmark;
import org.springframework.stereotype.Service;

@Service
public interface BenchmarkServices {
    public Benchmark getBenchmark(int id);
}
