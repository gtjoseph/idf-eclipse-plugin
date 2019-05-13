/*******************************************************************************
 * Copyright 2018-2019 Espressif Systems (Shanghai) PTE LTD. All rights reserved.
 * Use is subject to license terms.
 *******************************************************************************/
package com.espressif.idf.sdk.config.core.server;

/**
 * @author Kondal Kolipaka <kondal.kolipaka@espressif.com>
 *
 */
public class JsonConfigProcessor
{

	/**
	 * @param jsonConfigOp output from idf.py menuconfig
	 * @return extracted json content
	 */
	public String getInitialOutput(String jsonConfigOp)
	{
		int startIndex = jsonConfigOp.indexOf("{\"ranges\":"); //$NON-NLS-1$
		if (startIndex != -1)
		{
			return jsonConfigOp.substring(startIndex);
		}

		return null;

	}

}