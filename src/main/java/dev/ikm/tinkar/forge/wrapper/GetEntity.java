package dev.ikm.tinkar.forge.wrapper;

import dev.ikm.tinkar.entity.Entity;
import dev.ikm.tinkar.entity.EntityVersion;
import freemarker.template.SimpleNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class GetEntity extends ForgeMethodWrapper {

    private final Logger LOG = LoggerFactory.getLogger(GetEntity.class);

    @Override
    public Entity<? extends EntityVersion> exec(List list) {
        SimpleNumber simpleNumber = (SimpleNumber) list.getFirst();
        int nid = convertSimpleNumber(simpleNumber);
        return Entity.getFast(nid);
    }
}
