package test;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.*;

import org.springframework.context.*;
import org.springframework.context.support.*;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Fork(1)
@Warmup(iterations = 0)
@Measurement(iterations = 1)
@State(Scope.Benchmark)
public class SampleBenchmark {
  @Setup(Level.Trial)
  public void setUp() {
      ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
  }

  @Benchmark
  public long baseLine() {
    return Long.MAX_VALUE;
  }
}
