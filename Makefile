generate:
	protoc protos/*.proto --go_out=gen/go --go-grpc_out=gen/go