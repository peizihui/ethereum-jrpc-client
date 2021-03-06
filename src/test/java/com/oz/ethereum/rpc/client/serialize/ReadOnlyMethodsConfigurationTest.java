package com.oz.ethereum.rpc.client.serialize;

/**
 * <p><b>Created:</b> 15/08/16, 04:20 PM</p>
 *
 * @author <a href="mailto:sock.sqt@gmail.com">samuel</a>
 * @since 0.1.0
 */

import com.oz.ethereum.rpc.client.serialize.annotations.MethodConfiguration;
import com.oz.ethereum.rpc.client.serialize.annotations.MethodsConfiguration;
import com.oz.ethereum.rpc.client.serialize.annotations.SolidityParameter;
import com.oz.ethereum.rpc.client.serialize.annotations.SolidityType;

@MethodConfiguration(id = "readOnlyMethod", methodName = "readOnlyMethod",
    inParameters = {
        @SolidityParameter(name = "isAdult", type = SolidityType.BOOL),
        @SolidityParameter(name = "username", type = SolidityType.STRING),
        @SolidityParameter(name = "firstName", type = SolidityType.STRING),
        @SolidityParameter(name = "lastName", type = SolidityType.STRING),
        @SolidityParameter(name = "userAddress", type = SolidityType.ADDRESS),
        @SolidityParameter(name = "email", type = SolidityType.BYTES),
        @SolidityParameter(name = "age", type = SolidityType.UINT),
    },
    outParameters = {
        @SolidityParameter(name = "isAdult", type = SolidityType.BOOL),
        @SolidityParameter(name = "firsName", type = SolidityType.STRING),
        @SolidityParameter(name = "lastName", type = SolidityType.STRING),
        @SolidityParameter(name = "age", type = SolidityType.UINT),
    }
)
public interface ReadOnlyMethodsConfigurationTest { }
