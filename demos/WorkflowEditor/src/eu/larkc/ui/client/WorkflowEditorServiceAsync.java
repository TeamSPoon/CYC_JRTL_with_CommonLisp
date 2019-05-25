/*
   This file is part of the LarKC platform 
   http://www.larkc.eu/

   Copyright 2010 LarKC project consortium

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package eu.larkc.ui.client;

import java.io.IOException;
import java.util.List;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>WorkflowEditorService</code>.
 */
public interface WorkflowEditorServiceAsync {
	void getPlugins( AsyncCallback<List<String>> callback ) throws IOException;
	void removePlugin( String plugin, AsyncCallback<Boolean> callback ) throws IOException;
	void addPlugin( String plugin, AsyncCallback<Boolean> callback ) throws IOException;
}