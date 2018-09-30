package com.example.fileconsumer.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.example.fileconsumer.entity.TestObj;
import io.swagger.annotations.ApiOperation;

@RestController
public class FileController {

	@CrossOrigin(origins = "*")
	@PostMapping(value = "/uploadFile", consumes = { MediaType.MULTIPART_FORM_DATA_VALUE })
	@ApiOperation("Just upload a file.")
	public ResponseEntity<Void> uploadFile(@RequestPart(required = false) TestObj testObjJson,
			@RequestPart(required = false) MultipartFile file) {
		return ResponseEntity.ok(null);
	}
}
