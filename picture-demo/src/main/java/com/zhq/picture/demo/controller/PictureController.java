package com.zhq.picture.demo.controller;

import com.zhq.picture.demo.util.PictureUtil;
import com.zhq.picture.demo.util.ThumbnailatorUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @author : ZHQ
 * @date : 2019/11/25
 */
@RestController
public class PictureController {
    private static final Logger logger = LoggerFactory.getLogger(PictureController.class);
    private static final long LIMIT_SIZE = 30 * 1024;

    @RequestMapping(value = "/upload/image/limitSize", method = RequestMethod.POST)
    public String uploadImageLimitSize(@RequestParam(value = "file") MultipartFile file) throws Exception {
        logger.info("enter the mothod");
        String basicDir = "E:\\TmpData\\";
        String fileName = file.getOriginalFilename();
        File targetFile = new File(basicDir, fileName);
        if (!targetFile.getParentFile().exists()) {
            if (!targetFile.getParentFile().mkdirs()) {
                logger.error("error");
            }
        }
        file.transferTo(targetFile);
        String sourcePath = basicDir + fileName;

        String pictureType = PictureUtil.getPictureType(file);
        if (!"png".equals(pictureType)) {
            long originSize = file.getSize();
            float quality = (float) LIMIT_SIZE / originSize;
            System.out.println("quality = " + quality);
            ThumbnailatorUtils.suppressImgByQuality(sourcePath, sourcePath, quality);
        }

        return basicDir + fileName;
    }







}
