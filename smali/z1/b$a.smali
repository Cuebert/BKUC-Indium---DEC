.class final Lz1/b$a;
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
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ll5/d<",
        "Lz1/a;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lz1/b$a;

.field private static final b:Ll5/c;

.field private static final c:Ll5/c;

.field private static final d:Ll5/c;

.field private static final e:Ll5/c;

.field private static final f:Ll5/c;

.field private static final g:Ll5/c;

.field private static final h:Ll5/c;

.field private static final i:Ll5/c;

.field private static final j:Ll5/c;

.field private static final k:Ll5/c;

.field private static final l:Ll5/c;

.field private static final m:Ll5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lz1/b$a;

    invoke-direct {v0}, Lz1/b$a;-><init>()V

    sput-object v0, Lz1/b$a;->a:Lz1/b$a;

    const-string v0, "sdkVersion"

    .line 2
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, Lz1/b$a;->b:Ll5/c;

    const-string v0, "model"

    .line 3
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, Lz1/b$a;->c:Ll5/c;

    const-string v0, "hardware"

    .line 4
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, Lz1/b$a;->d:Ll5/c;

    const-string v0, "device"

    .line 5
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, Lz1/b$a;->e:Ll5/c;

    const-string v0, "product"

    .line 6
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, Lz1/b$a;->f:Ll5/c;

    const-string v0, "osBuild"

    .line 7
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, Lz1/b$a;->g:Ll5/c;

    const-string v0, "manufacturer"

    .line 8
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, Lz1/b$a;->h:Ll5/c;

    const-string v0, "fingerprint"

    .line 9
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, Lz1/b$a;->i:Ll5/c;

    const-string v0, "locale"

    .line 10
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, Lz1/b$a;->j:Ll5/c;

    const-string v0, "country"

    .line 11
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, Lz1/b$a;->k:Ll5/c;

    const-string v0, "mccMnc"

    .line 12
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, Lz1/b$a;->l:Ll5/c;

    const-string v0, "applicationBuild"

    .line 13
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, Lz1/b$a;->m:Ll5/c;

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

    check-cast p1, Lz1/a;

    check-cast p2, Ll5/e;

    invoke-virtual {p0, p1, p2}, Lz1/b$a;->b(Lz1/a;Ll5/e;)V

    return-void
.end method

.method public b(Lz1/a;Ll5/e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lz1/b$a;->b:Ll5/c;

    invoke-virtual {p1}, Lz1/a;->m()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    .line 2
    sget-object v0, Lz1/b$a;->c:Ll5/c;

    invoke-virtual {p1}, Lz1/a;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    .line 3
    sget-object v0, Lz1/b$a;->d:Ll5/c;

    invoke-virtual {p1}, Lz1/a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    .line 4
    sget-object v0, Lz1/b$a;->e:Ll5/c;

    invoke-virtual {p1}, Lz1/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    .line 5
    sget-object v0, Lz1/b$a;->f:Ll5/c;

    invoke-virtual {p1}, Lz1/a;->l()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    .line 6
    sget-object v0, Lz1/b$a;->g:Ll5/c;

    invoke-virtual {p1}, Lz1/a;->k()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    .line 7
    sget-object v0, Lz1/b$a;->h:Ll5/c;

    invoke-virtual {p1}, Lz1/a;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    .line 8
    sget-object v0, Lz1/b$a;->i:Ll5/c;

    invoke-virtual {p1}, Lz1/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    .line 9
    sget-object v0, Lz1/b$a;->j:Ll5/c;

    invoke-virtual {p1}, Lz1/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    .line 10
    sget-object v0, Lz1/b$a;->k:Ll5/c;

    invoke-virtual {p1}, Lz1/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    .line 11
    sget-object v0, Lz1/b$a;->l:Ll5/c;

    invoke-virtual {p1}, Lz1/a;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    .line 12
    sget-object v0, Lz1/b$a;->m:Ll5/c;

    invoke-virtual {p1}, Lz1/a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    return-void
.end method
