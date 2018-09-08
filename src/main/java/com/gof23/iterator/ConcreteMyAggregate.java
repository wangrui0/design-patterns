package com.gof23.iterator;

import java.util.ArrayList;
import java.util.List;

/***
 * 自定义的聚合类 
 * @author jack
 *
 */
public class ConcreteMyAggregate {
    
    private List<Object> list=new ArrayList<Object>();
    public void addObj(Object obj){
        this.list.add(obj);
    }
    public Object getObj(int index){
        return list.get(index);
    }
    public Object removeObj(int index){
        return this.list.remove(index);
    }
    public ConcreateIterator createIterator(){
        return new ConcreateIterator();
    }
    private class  ConcreateIterator implements MyIterator{
        private int  cursor;
        @Override
        public void first() {
            this.cursor=0;
        }

        @Override
        public void last() {
            this.cursor=list.size()-1;
        }

        @Override
        public boolean isFirst() {
            return this.cursor==0;
        }

        @Override
        public boolean isLast() {
            return this.cursor==list.size()-1;
        }

        @Override
        public boolean hasNext() {
            return this.cursor<list.size();
        }

        @Override
        public void next() {
            if(this.cursor<list.size()){
                this.cursor++;
            }
        }

        @Override
        public Object getCurrentObj() {
            return list.get(cursor);
        }            
        
    }
}
