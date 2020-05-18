package com.zhq.picture.demo.util;

import net.coobird.thumbnailator.Thumbnails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: ZHQ
 * @description:
 * @Date: 2019/11/28 11:29
 */
public final class PictureUtil {

    private static final Logger logger = LoggerFactory.getLogger(PictureUtil.class);

    private PictureUtil() {
        super();
    }


    /**
     * 图片尺寸不变，压缩图片文件大小
     *
     * @param quality 参数1为最高质量
     */
    public static void compressImageByQuality(String sourcePath, String targetPath, float quality)
                    throws Exception {
        Thumbnails.of(sourcePath).scale(1f).outputQuality(quality).toFile(targetPath);
    }


    /**
     * 图片尺寸不变，压缩图片文件大小（指定大小）
     *
     * @param sourcePath 原路径
     * @param targetPath 目标路径
     * @param originSize 源文件大小
     * @param limitSize  目标文件大小
     */
    public static void compressImageByFinalSize(String sourcePath, String targetPath,
                    long originSize, long limitSize) throws Exception {
        if (originSize <= limitSize) {
            return;
        }
        float quality = (float) limitSize / originSize;
        logger.info("picture {} compress quality = {}", sourcePath, quality);
        compressImageByQuality(sourcePath, targetPath, quality);
    }


    public static String getPictureType(MultipartFile file) {
        String originalName = file.getOriginalFilename();
        String contentType = file.getContentType();
        String suffixLowerCase = originalName.substring(originalName.lastIndexOf(".") + 1).toLowerCase();
        IMAGE_TYPE_SUPPORT imageMime = IMAGE_TYPE_SUPPORT.supportType(contentType, suffixLowerCase);
        if (IMAGE_TYPE_SUPPORT.PNG.equals(imageMime)) {
            System.out.println("png");
        }
        return imageMime.getContentType();
    }

}
