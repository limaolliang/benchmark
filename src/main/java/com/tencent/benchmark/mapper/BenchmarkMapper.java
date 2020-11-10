package com.tencent.benchmark.mapper;

import com.tencent.benchmark.model.Benchmark;
import com.tencent.benchmark.model.BenchmarkExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BenchmarkMapper {
    int countByExample(BenchmarkExample example);

    int deleteByExample(BenchmarkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Benchmark record);

    int insertSelective(Benchmark record);

    List<Benchmark> selectByExampleWithBLOBs(BenchmarkExample example);

    List<Benchmark> selectByExample(BenchmarkExample example);

    Benchmark selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Benchmark record, @Param("example") BenchmarkExample example);

    int updateByExampleWithBLOBs(@Param("record") Benchmark record, @Param("example") BenchmarkExample example);

    int updateByExample(@Param("record") Benchmark record, @Param("example") BenchmarkExample example);

    int updateByPrimaryKeySelective(Benchmark record);

    int updateByPrimaryKeyWithBLOBs(Benchmark record);

    int updateByPrimaryKey(Benchmark record);
}