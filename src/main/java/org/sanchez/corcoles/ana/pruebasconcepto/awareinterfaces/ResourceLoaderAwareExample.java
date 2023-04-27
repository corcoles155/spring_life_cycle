package org.sanchez.corcoles.ana.pruebasconcepto.awareinterfaces;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Slf4j
@Component
public class ResourceLoaderAwareExample implements ResourceLoaderAware {

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        final Resource file = resourceLoader.getResource("classpath:data/example.txt");
        try {
            final String textFile = getText(file);
            log.info("***** {} file has been read: {} *****", file.getFilename(), textFile);
        } catch (IOException e) {
            log.warn("{} file hasn't been read", file.getFilename());
        }
    }

    private String getText(final Resource file) throws IOException {
        final InputStream inputStream = file.getInputStream();
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        return bufferedReader.readLine();
    }
}
