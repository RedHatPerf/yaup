package io.hyperfoil.tools.yaup.json.graaljs;

import org.graalvm.polyglot.io.FileSystem;

import java.io.IOException;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.*;
import java.nio.file.attribute.FileAttribute;
import java.util.Map;
import java.util.Set;

public class JsFileSystem implements FileSystem {
   @Override
   public Path parsePath(URI uri) {
      return Paths.get(uri);
   }

   @Override
   public Path parsePath(String path) {
      Path rtrn = Paths.get(path);
      return rtrn;
   }

   @Override
   public void checkAccess(Path path, Set<? extends AccessMode> modes, LinkOption... linkOptions) throws IOException {

   }

   @Override
   public void createDirectory(Path dir, FileAttribute<?>... attrs) throws IOException {

   }

   @Override
   public void delete(Path path) throws IOException {

   }

   @Override
   public SeekableByteChannel newByteChannel(Path path, Set<? extends OpenOption> options, FileAttribute<?>... attrs) throws IOException {
      //Here is where files get mapped to bytes, this isn't called if the path the name of an existing Source
      FileChannel rtrn = FileChannel.open(path);
      return rtrn;
   }

   @Override
   public DirectoryStream<Path> newDirectoryStream(Path dir, DirectoryStream.Filter<? super Path> filter) throws IOException {
      return null;
   }

   @Override
   public Path toAbsolutePath(Path path) {
      return path;
   }

   @Override
   public Path toRealPath(Path path, LinkOption... linkOptions) throws IOException {
      Path rtrn = path;
      return rtrn;
   }

   @Override
   public Map<String, Object> readAttributes(Path path, String attributes, LinkOption... options) throws IOException {
      return null;
   }
}
