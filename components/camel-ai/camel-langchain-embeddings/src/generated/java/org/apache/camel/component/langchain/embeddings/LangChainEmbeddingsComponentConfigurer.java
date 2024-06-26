/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.langchain.embeddings;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class LangChainEmbeddingsComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.langchain.embeddings.LangChainEmbeddingsConfiguration getOrCreateConfiguration(LangChainEmbeddingsComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.langchain.embeddings.LangChainEmbeddingsConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        LangChainEmbeddingsComponent target = (LangChainEmbeddingsComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.langchain.embeddings.LangChainEmbeddingsConfiguration.class, value)); return true;
        case "embeddingmodel":
        case "embeddingModel": getOrCreateConfiguration(target).setEmbeddingModel(property(camelContext, dev.langchain4j.model.embedding.EmbeddingModel.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public String[] getAutowiredNames() {
        return new String[]{"embeddingModel"};
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "configuration": return org.apache.camel.component.langchain.embeddings.LangChainEmbeddingsConfiguration.class;
        case "embeddingmodel":
        case "embeddingModel": return dev.langchain4j.model.embedding.EmbeddingModel.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        LangChainEmbeddingsComponent target = (LangChainEmbeddingsComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "configuration": return target.getConfiguration();
        case "embeddingmodel":
        case "embeddingModel": return getOrCreateConfiguration(target).getEmbeddingModel();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        default: return null;
        }
    }
}

