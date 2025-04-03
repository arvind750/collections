package advancedLevelProblems.customCachingSystem;

public class ExpensiveComputation {
    // Apply the @CacheResult annotation here to enable caching for this method
    @CacheResult
    public int fibonacci(int n) {
        String key = "fibonacci-" + n;
        if (CacheUtil.getCachedResult(key) != null) {
            return (int) CacheUtil.getCachedResult(key); // Return cached result
        }
        int result = (n <= 1) ? n : fibonacci(n - 1) + fibonacci(n - 2);
        return (int) CacheUtil.cacheResult(key, result); // Cache and return result
    }
}
