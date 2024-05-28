.class final Ly3/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll5/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ll5/d<",
        "Ly3/y;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Ly3/v0;

.field private static final b:Ll5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ly3/v0;

    invoke-direct {v0}, Ly3/v0;-><init>()V

    sput-object v0, Ly3/v0;->a:Ly3/v0;

    const-string v0, "errorCode"

    .line 1
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Ly3/e8;

    .line 2
    invoke-direct {v1}, Ly3/e8;-><init>()V

    const/4 v2, 0x1

    .line 3
    invoke-virtual {v1, v2}, Ly3/e8;->a(I)Ly3/e8;

    invoke-virtual {v1}, Ly3/e8;->b()Ly3/i8;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Ly3/v0;->b:Ll5/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Ly3/y;

    check-cast p2, Ll5/e;

    const/4 p1, 0x0

    throw p1
.end method
