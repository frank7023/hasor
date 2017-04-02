/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hasor.graphql.task.source;
import net.hasor.graphql.task.TaskContext;
/**
 *
 * @author 赵永春(zyc@hasor.net)
 * @version : 2017-03-23
 */
public class RouteSourceTask extends SourceQueryTask {
    private String routeExpression;
    public RouteSourceTask(TaskContext taskContext, SourceQueryTask dataSource, String routeExpression) {
        super(taskContext);
        if (dataSource != null) {
            super.addSubTask(dataSource);
        }
        this.routeExpression = routeExpression;
    }
    //
    public String getRouteExpression() {
        return this.routeExpression;
    }
    //
    @Override
    protected Object doTask(TaskContext taskContext) throws Throwable {
        return null;
    }
}