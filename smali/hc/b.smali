.class final Lhc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgc/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lgc/f<",
        "TT;",
        "Lob/h0;",
        ">;"
    }
.end annotation


# static fields
.field private static final c:Lob/b0;

.field private static final d:Ljava/nio/charset/Charset;


# instance fields
.field private final a:Lb6/f;

.field private final b:Lb6/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb6/v<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "application/json; charset=UTF-8"

    .line 1
    invoke-static {v0}, Lob/b0;->c(Ljava/lang/String;)Lob/b0;

    move-result-object v0

    sput-object v0, Lhc/b;->c:Lob/b0;

    const-string v0, "UTF-8"

    .line 2
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lhc/b;->d:Ljava/nio/charset/Charset;

    return-void
.end method

.method constructor <init>(Lb6/f;Lb6/v;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb6/f;",
            "Lb6/v<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lhc/b;->a:Lb6/f;

    .line 3
    iput-object p2, p0, Lhc/b;->b:Lb6/v;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lhc/b;->b(Ljava/lang/Object;)Lob/h0;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Object;)Lob/h0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lob/h0;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lac/c;

    invoke-direct {v0}, Lac/c;-><init>()V

    .line 2
    new-instance v1, Ljava/io/OutputStreamWriter;

    invoke-virtual {v0}, Lac/c;->o0()Ljava/io/OutputStream;

    move-result-object v2

    sget-object v3, Lhc/b;->d:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 3
    iget-object v2, p0, Lhc/b;->a:Lb6/f;

    invoke-virtual {v2, v1}, Lb6/f;->q(Ljava/io/Writer;)Lcom/google/gson/stream/JsonWriter;

    move-result-object v1

    .line 4
    iget-object v2, p0, Lhc/b;->b:Lb6/v;

    invoke-virtual {v2, v1, p1}, Lb6/v;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V

    .line 5
    invoke-virtual {v1}, Lcom/google/gson/stream/JsonWriter;->close()V

    .line 6
    sget-object p1, Lhc/b;->c:Lob/b0;

    invoke-virtual {v0}, Lac/c;->r0()Lac/f;

    move-result-object v0

    invoke-static {p1, v0}, Lob/h0;->c(Lob/b0;Lac/f;)Lob/h0;

    move-result-object p1

    return-object p1
.end method
