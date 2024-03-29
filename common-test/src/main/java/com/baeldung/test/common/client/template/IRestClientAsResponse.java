package com.baeldung.test.common.client.template;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;

import com.baeldung.common.interfaces.IDto;
import com.baeldung.common.search.ClientOperation;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public interface IRestClientAsResponse<T extends IDto> {

    Response read(final String uriOfResource);

    // find - one

    Response findOneAsResponse(final long id);

    Response findOneByUriAsResponse(final String uriOfResource, final RequestSpecification req);

    // find - all

    Response findAllAsResponse(final RequestSpecification req);

    Response findAllPaginatedAsResponse(final int page, final int size);

    Response findAllSortedAsResponse(final String sortBy, final String sortOrder);

    Response findAllPaginatedAndSortedAsResponse(final int page, final int size, final String sortBy, final String sortOrder);

    // search

    Response searchAsResponse(final Triple<String, ClientOperation, String> idOp, final Triple<String, ClientOperation, String> nameOp);

    Response searchAsResponse(final Triple<String, ClientOperation, String> idOp, final Triple<String, ClientOperation, String> nameOp, final int page, final int size);

    Response searchAsResponse(final Triple<String, ClientOperation, String>... constraints);

    // create

    Response createAsResponse(final T resource);

    Response createAsResponse(final T resource, final Pair<String, String> credentials);

    // update

    Response updateAsResponse(final T resource);

    // delete

    Response deleteAsResponse(final long id);

    // count

    Response countAsResponse();

}
