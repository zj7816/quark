/** *dianping.com Inc *Copyright(c)2004-2016 All Rights Reserved. */package ren.quark.domain.model.handling;import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;import java.util.Date;/** * @author zhangjie * @version $Id: PushEvent.java, v 0.1 2016-03-14 上午11:49 zhangjie Exp $$ */public class PushEvent implements DomainEvent<PushEvent> {    /**     * 幂等性校验     */    private String UUID;    /**     * 推送人     */    private BIConversion.User user;    private Date generateDate;    public Date generateDate() {        return generateDate;    }    @Override    public boolean sameEventAs(PushEvent pushEvent) {        return false;    }}