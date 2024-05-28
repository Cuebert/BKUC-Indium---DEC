.class final La2/a$b;
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
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ll5/d<",
        "Ld2/b;",
        ">;"
    }
.end annotation


# static fields
.field static final a:La2/a$b;

.field private static final b:Ll5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La2/a$b;

    invoke-direct {v0}, La2/a$b;-><init>()V

    sput-object v0, La2/a$b;->a:La2/a$b;

    const-string v0, "storageMetrics"

    .line 2
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    .line 3
    invoke-static {}, Lo5/a;->b()Lo5/a;

    move-result-object v1

    const/4 v2, 0x1

    .line 4
    invoke-virtual {v1, v2}, Lo5/a;->c(I)Lo5/a;

    move-result-object v1

    .line 5
    invoke-virtual {v1}, Lo5/a;->a()Lo5/d;

    move-result-object v1

    .line 6
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, La2/a$b;->b:Ll5/c;

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

    check-cast p1, Ld2/b;

    check-cast p2, Ll5/e;

    invoke-virtual {p0, p1, p2}, La2/a$b;->b(Ld2/b;Ll5/e;)V

    return-void
.end method

.method public b(Ld2/b;Ll5/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, La2/a$b;->b:Ll5/c;

    invoke-virtual {p1}, Ld2/b;->a()Ld2/e;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    return-void
.end method
