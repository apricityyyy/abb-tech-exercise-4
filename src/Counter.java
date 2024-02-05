public class Counter {
    static int instanceCount = 0;

    Counter() {
        instanceCount++;
    }

    int getInstanceCount() {
        return instanceCount;
    }
}
