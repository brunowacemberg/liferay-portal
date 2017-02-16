/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.osb.salesforce.client.streaming;

import com.liferay.osb.salesforce.client.SalesforceConnector;

import org.cometd.bayeux.Channel;

/**
 * @author Brian Wing Shun Chan
 * @author Rachael Koestartyo
 * @author Peter Shin
 */
public interface SalesforceStreamingClient {

	public boolean connect();

	public boolean disconnect();

	public Channel getChannel(String name);

	public SalesforceConnector getSalesforceConnector();

	public int getTransportTimeout();

	public void setSalesforceConnector(SalesforceConnector salesforceConnector);

	public void setTransportTimeout(int transportTimeout);

}