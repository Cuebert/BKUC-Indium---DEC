.class public interface abstract Lob/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lob/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lob/r;->b:Lob/r;

    sput-object v0, Lob/t;->a:Lob/t;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/net/InetAddress;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;
        }
    .end annotation
.end method
