.class final Ly3/o3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll5/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ll5/d<",
        "Ly3/o6;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Ly3/o3;

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

.field private static final n:Ll5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ly3/o3;

    invoke-direct {v0}, Ly3/o3;-><init>()V

    sput-object v0, Ly3/o3;->a:Ly3/o3;

    const-string v0, "appId"

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

    sput-object v0, Ly3/o3;->b:Ll5/c;

    const-string v0, "appVersion"

    .line 6
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Ly3/e8;

    .line 7
    invoke-direct {v1}, Ly3/e8;-><init>()V

    const/4 v2, 0x2

    .line 8
    invoke-virtual {v1, v2}, Ly3/e8;->a(I)Ly3/e8;

    invoke-virtual {v1}, Ly3/e8;->b()Ly3/i8;

    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Ly3/o3;->c:Ll5/c;

    const-string v0, "firebaseProjectId"

    .line 11
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Ly3/e8;

    .line 12
    invoke-direct {v1}, Ly3/e8;-><init>()V

    const/4 v2, 0x3

    .line 13
    invoke-virtual {v1, v2}, Ly3/e8;->a(I)Ly3/e8;

    invoke-virtual {v1}, Ly3/e8;->b()Ly3/i8;

    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Ly3/o3;->d:Ll5/c;

    const-string v0, "mlSdkVersion"

    .line 16
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Ly3/e8;

    .line 17
    invoke-direct {v1}, Ly3/e8;-><init>()V

    const/4 v2, 0x4

    .line 18
    invoke-virtual {v1, v2}, Ly3/e8;->a(I)Ly3/e8;

    invoke-virtual {v1}, Ly3/e8;->b()Ly3/i8;

    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Ly3/o3;->e:Ll5/c;

    const-string v0, "tfliteSchemaVersion"

    .line 21
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Ly3/e8;

    .line 22
    invoke-direct {v1}, Ly3/e8;-><init>()V

    const/4 v2, 0x5

    .line 23
    invoke-virtual {v1, v2}, Ly3/e8;->a(I)Ly3/e8;

    invoke-virtual {v1}, Ly3/e8;->b()Ly3/i8;

    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Ly3/o3;->f:Ll5/c;

    const-string v0, "gcmSenderId"

    .line 26
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Ly3/e8;

    .line 27
    invoke-direct {v1}, Ly3/e8;-><init>()V

    const/4 v2, 0x6

    .line 28
    invoke-virtual {v1, v2}, Ly3/e8;->a(I)Ly3/e8;

    invoke-virtual {v1}, Ly3/e8;->b()Ly3/i8;

    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Ly3/o3;->g:Ll5/c;

    const-string v0, "apiKey"

    .line 31
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Ly3/e8;

    .line 32
    invoke-direct {v1}, Ly3/e8;-><init>()V

    const/4 v2, 0x7

    .line 33
    invoke-virtual {v1, v2}, Ly3/e8;->a(I)Ly3/e8;

    invoke-virtual {v1}, Ly3/e8;->b()Ly3/i8;

    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Ly3/o3;->h:Ll5/c;

    const-string v0, "languages"

    .line 36
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Ly3/e8;

    .line 37
    invoke-direct {v1}, Ly3/e8;-><init>()V

    const/16 v2, 0x8

    .line 38
    invoke-virtual {v1, v2}, Ly3/e8;->a(I)Ly3/e8;

    invoke-virtual {v1}, Ly3/e8;->b()Ly3/i8;

    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Ly3/o3;->i:Ll5/c;

    const-string v0, "mlSdkInstanceId"

    .line 41
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Ly3/e8;

    .line 42
    invoke-direct {v1}, Ly3/e8;-><init>()V

    const/16 v2, 0x9

    .line 43
    invoke-virtual {v1, v2}, Ly3/e8;->a(I)Ly3/e8;

    invoke-virtual {v1}, Ly3/e8;->b()Ly3/i8;

    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Ly3/o3;->j:Ll5/c;

    const-string v0, "isClearcutClient"

    .line 46
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Ly3/e8;

    .line 47
    invoke-direct {v1}, Ly3/e8;-><init>()V

    const/16 v2, 0xa

    .line 48
    invoke-virtual {v1, v2}, Ly3/e8;->a(I)Ly3/e8;

    invoke-virtual {v1}, Ly3/e8;->b()Ly3/i8;

    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 50
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Ly3/o3;->k:Ll5/c;

    const-string v0, "isStandaloneMlkit"

    .line 51
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Ly3/e8;

    .line 52
    invoke-direct {v1}, Ly3/e8;-><init>()V

    const/16 v2, 0xb

    .line 53
    invoke-virtual {v1, v2}, Ly3/e8;->a(I)Ly3/e8;

    invoke-virtual {v1}, Ly3/e8;->b()Ly3/i8;

    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Ly3/o3;->l:Ll5/c;

    const-string v0, "isJsonLogging"

    .line 56
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Ly3/e8;

    .line 57
    invoke-direct {v1}, Ly3/e8;-><init>()V

    const/16 v2, 0xc

    .line 58
    invoke-virtual {v1, v2}, Ly3/e8;->a(I)Ly3/e8;

    invoke-virtual {v1}, Ly3/e8;->b()Ly3/i8;

    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Ly3/o3;->m:Ll5/c;

    const-string v0, "buildLevel"

    .line 61
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Ly3/e8;

    .line 62
    invoke-direct {v1}, Ly3/e8;-><init>()V

    const/16 v2, 0xd

    .line 63
    invoke-virtual {v1, v2}, Ly3/e8;->a(I)Ly3/e8;

    invoke-virtual {v1}, Ly3/e8;->b()Ly3/i8;

    move-result-object v1

    .line 64
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Ly3/o3;->n:Ll5/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Ly3/o6;

    check-cast p2, Ll5/e;

    sget-object v0, Ly3/o3;->b:Ll5/c;

    .line 2
    invoke-virtual {p1}, Ly3/o6;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Ly3/o3;->c:Ll5/c;

    .line 3
    invoke-virtual {p1}, Ly3/o6;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Ly3/o3;->d:Ll5/c;

    const/4 v1, 0x0

    .line 4
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Ly3/o3;->e:Ll5/c;

    .line 5
    invoke-virtual {p1}, Ly3/o6;->i()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v0, v2}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Ly3/o3;->f:Ll5/c;

    .line 6
    invoke-virtual {p1}, Ly3/o6;->j()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v0, v2}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Ly3/o3;->g:Ll5/c;

    .line 7
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Ly3/o3;->h:Ll5/c;

    .line 8
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Ly3/o3;->i:Ll5/c;

    .line 9
    invoke-virtual {p1}, Ly3/o6;->a()Ly3/z7;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Ly3/o3;->j:Ll5/c;

    .line 10
    invoke-virtual {p1}, Ly3/o6;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Ly3/o3;->k:Ll5/c;

    .line 11
    invoke-virtual {p1}, Ly3/o6;->b()Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Ly3/o3;->l:Ll5/c;

    .line 12
    invoke-virtual {p1}, Ly3/o6;->d()Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Ly3/o3;->m:Ll5/c;

    .line 13
    invoke-virtual {p1}, Ly3/o6;->c()Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Ly3/o3;->n:Ll5/c;

    .line 14
    invoke-virtual {p1}, Ly3/o6;->e()Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    return-void
.end method
