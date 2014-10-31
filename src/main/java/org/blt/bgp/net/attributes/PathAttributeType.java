/**
 *  Copyright 2012 Rainer Bieniek (Rainer.Bieniek@web.de)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * 
 * File: org.blt.bgp.net.attributes.PathAttributeType.java 
 */
package org.blt.bgp.net.attributes;

/**
 * Path attribute type used internally for sorting, comparing and hash-code building.
 * 
 * @author Rainer Bieniek (Rainer.Bieniek@web.de)
 *
 */
public enum PathAttributeType {
	AGGREGATOR,
	AS_PATH,
	ATOMIC_AGGREGATE,
	CLUSTER_LIST,
	COMMUNITY,
	LOCAL_PREF,
	MULTI_EXIT_DISC,
	MULTI_PROTOCOL_REACHABLE,
	MULTI_PROTOCOL_UNREACHABLE,
	NEXT_HOP,
	ORIGINATOR_ID,
	ORIGIN,
	LINK_STATE,
	UNKNOWN
}
