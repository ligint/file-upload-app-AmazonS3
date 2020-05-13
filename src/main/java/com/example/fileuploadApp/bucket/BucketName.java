package com.example.fileuploadApp.bucket;

public enum BucketName {

    PROFILE_IMAGE("your S3 bucket name");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
