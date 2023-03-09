public class PaintJob {

        public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
            if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
                return -1;
            }
            double areaToPaint = width * height;
            int requiredBuckets = (int) Math.ceil((areaToPaint / areaPerBucket) - extraBuckets);
            return requiredBuckets;
        }

        public static int getBucketCount(double width, double height, double areaPerBucket) {
            return getBucketCount(width, height, areaPerBucket, 0);
        }

        public static int getBucketCount(double area, double areaPerBucket) {
            if (area <= 0 || areaPerBucket <= 0) {
                return -1;
            }
            int requiredBuckets = (int) Math.ceil(area / areaPerBucket);
            return requiredBuckets;
        }
    }

