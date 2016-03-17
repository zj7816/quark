/** *dianping.com Inc *Copyright(c)2004-2016 All Rights Reserved. */package ren.quark.domain.model.handling;import org.apache.commons.lang3.Validate;import ren.quark.domain.model.shared.ValueObject;import java.util.*;/** * @author zhangjie * @version $Id: PushEventHistory.java, v 0.1 2016-03-17 上午11:29 zhangjie Exp $$ */public class PushEventHistory implements ValueObject<PushEventHistory> {    private List<PushEvent> PushEventList;    private static final List<PushEvent> EMPTY = Collections.<PushEvent>emptyList();    public PushEventHistory(final List<PushEvent> PushEvents) {        Validate.notEmpty(PushEvents, "PushEvents can not be null");        setPushEventList(PushEvents);    }    public List<PushEvent> pushByGenerateTime() {        final List<PushEvent> ordered = new ArrayList<PushEvent>(new HashSet<PushEvent>(PushEventList));        Collections.sort(ordered, new Comparator<PushEvent>() {            @Override            public int compare(PushEvent o1, PushEvent o2) {                return o1.generateDate().compareTo(o2.generateDate());            }        });        return Collections.unmodifiableList(ordered);    }    @Override    public boolean sameAs(PushEventHistory other) {        return other != null && PushEventList.equals(other.PushEventList);    }    private void setPushEventList(List<PushEvent> PushEventList) {        this.PushEventList = new ArrayList<PushEvent>(PushEventList);    }    @Override    public boolean equals(Object obj) {        if (obj == this) {            return true;        }        if (!(obj instanceof PushEventHistory)) {            return false;        }        return sameAs((PushEventHistory) obj);    }    @Override    public int hashCode() {        return this.PushEventList.hashCode();    }}