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
 * File: org.blt.bgp.netty.protocol.BgpProtocolVersionException.java 
 */
package org.blt.bgp.netty.protocol.open;

import org.blt.bgp.netty.protocol.NotificationPacket;

/**
 * @author Rainer Bieniek (Rainer.Bieniek@web.de)
 *
 */
public class UnsupportedVersionNumberException extends OpenPacketException {

	private int supportedProtocolVersion;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6258258151952280005L;

	public UnsupportedVersionNumberException() {
	}

	public UnsupportedVersionNumberException(int supportedProtocolVersion) {
		this.supportedProtocolVersion = supportedProtocolVersion;
	}

	public UnsupportedVersionNumberException(String message, int supportedProtocolVersion) {
		super(message);
		
		this.supportedProtocolVersion = supportedProtocolVersion;
	}

	/**
	 * @return the supportedProtocolVersion
	 */
	public int getSupportedProtocolVersion() {
		return supportedProtocolVersion;
	}

	@Override
	public NotificationPacket toNotificationPacket() {
		return new UnsupportedVersionNumberNotificationPacket(supportedProtocolVersion);
	}
}
