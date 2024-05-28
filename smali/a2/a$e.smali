.class final La2/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll5/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ll5/d<",
        "La2/l;",
        ">;"
    }
.end annotation


# static fields
.field static final a:La2/a$e;

.field private static final b:Ll5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La2/a$e;

    invoke-direct {v0}, La2/a$e;-><init>()V

    sput-object v0, La2/a$e;->a:La2/a$e;

    const-string v0, "clientMetrics"

    .line 2
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, La2/a$e;->b:Ll5/c;

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

    check-cast p1, La2/l;

    check-cast p2, Ll5/e;

    invoke-virtual {p0, p1, p2}, La2/a$e;->b(La2/l;Ll5/e;)V

    return-void
.end method

.method public b(La2/l;Ll5/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, La2/a$e;->b:Ll5/c;

    invoke-virtual {p1}, La2/l;->b()Ld2/a;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    return-void
.end method
