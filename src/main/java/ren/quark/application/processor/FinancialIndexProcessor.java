/** *dianping.com Inc *Copyright(c)2004-2016 All Rights Reserved. */package ren.quark.application.processor;import us.codecraft.webmagic.Page;import us.codecraft.webmagic.Site;import us.codecraft.webmagic.Spider;import us.codecraft.webmagic.processor.PageProcessor;/** * @author zhangjie * @version $Id: FinancialIndexProcessor.java, v 0.1 2016-12-28 下午5:03 zhangjie Exp $$ */public class FinancialIndexProcessor implements PageProcessor {    private Site site = Site.me().setRetryTimes(1);    @Override    public void process(Page page) {//        System.out.println(page.getHtml().$("price","src").$("span").toString());        System.out.println(page.getHtml().xpath("//span[@class='nameEllipsis']/text()").get());        System.out.println(page.getHtml().xpath("//*[@id=\"house-lst\"]/li/div[2]/div[2]/div[1]/span/text()").get());    }    @Override    public Site getSite() {        return site;    }    public static void main(String[] args) {        Spider.create(new FinancialIndexProcessor()).addUrl("http://sh.lianjia.com/ershoufang/q5011063588254").thread(1).run();    }}