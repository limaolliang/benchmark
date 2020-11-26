package com.tencent.benchmark.Serivce;

import com.tencent.benchmark.model.Benchmark;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BenchmarkServices {
    public Benchmark getBenchmark(int id);

    public List<Benchmark> getAll();
}
