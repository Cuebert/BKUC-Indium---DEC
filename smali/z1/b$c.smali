.class final Lz1/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll5/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ll5/d<",
        "Lz1/k;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lz1/b$c;

.field private static final b:Ll5/c;

.field private static final c:Ll5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lz1/b$c;

    invoke-direct {v0}, Lz1/b$c;-><init>()V

    sput-object v0, Lz1/b$c;->a:Lz1/b$c;

    const-string v0, "clientType"

    .line 2
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, Lz1/b$c;->b:Ll5/c;

    const-string v0, "androidClientInfo"

    .line 3
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, Lz1/b$c;->c:Ll5/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Lz1/k;

    check-cast p2, Ll5/e;

    invoke-virtual {p0, p1, p2}, Lz1/b$c;->b(Lz1/k;Ll5/e;)V

    return-void
.end method

.method public b(Lz1/k;Ll5/e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lz1/b$c;->b:Ll5/c;

    invoke-virtual {p1}, Lz1/k;->c()Lz1/k$b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    .line 2
    sget-object v0, Lz1/b$c;->c:Ll5/c;

    invoke-virtual {p1}, Lz1/k;->b()Lz1/a;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    return-void
.end method
