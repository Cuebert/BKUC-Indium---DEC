.class final Lz1/b$f;
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
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ll5/d<",
        "Lz1/o;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lz1/b$f;

.field private static final b:Ll5/c;

.field private static final c:Ll5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lz1/b$f;

    invoke-direct {v0}, Lz1/b$f;-><init>()V

    sput-object v0, Lz1/b$f;->a:Lz1/b$f;

    const-string v0, "networkType"

    .line 2
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, Lz1/b$f;->b:Ll5/c;

    const-string v0, "mobileSubtype"

    .line 3
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, Lz1/b$f;->c:Ll5/c;

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

    check-cast p1, Lz1/o;

    check-cast p2, Ll5/e;

    invoke-virtual {p0, p1, p2}, Lz1/b$f;->b(Lz1/o;Ll5/e;)V

    return-void
.end method

.method public b(Lz1/o;Ll5/e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lz1/b$f;->b:Ll5/c;

    invoke-virtual {p1}, Lz1/o;->c()Lz1/o$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    .line 2
    sget-object v0, Lz1/b$f;->c:Ll5/c;

    invoke-virtual {p1}, Lz1/o;->b()Lz1/o$b;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    return-void
.end method
