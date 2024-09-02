package com.tpexam.client.controller;

import com.tpexam.client.dto.ClientRequest;
import com.tpexam.client.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/client")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;






}
