.class final Lw3/b5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll5/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ll5/d<",
        "Lw3/w7;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lw3/b5;

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


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lw3/b5;

    invoke-direct {v0}, Lw3/b5;-><init>()V

    sput-object v0, Lw3/b5;->a:Lw3/b5;

    const-string v0, "durationMs"

    .line 1
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 2
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/4 v2, 0x1

    .line 3
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/b5;->b:Ll5/c;

    const-string v0, "errorCode"

    .line 6
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 7
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/4 v2, 0x2

    .line 8
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/b5;->c:Ll5/c;

    const-string v0, "isColdCall"

    .line 11
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 12
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/4 v2, 0x3

    .line 13
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/b5;->d:Ll5/c;

    const-string v0, "autoManageModelOnBackground"

    .line 16
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 17
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/4 v2, 0x4

    .line 18
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/b5;->e:Ll5/c;

    const-string v0, "autoManageModelOnLowMemory"

    .line 21
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 22
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/4 v2, 0x5

    .line 23
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/b5;->f:Ll5/c;

    const-string v0, "isNnApiEnabled"

    .line 26
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 27
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/4 v2, 0x6

    .line 28
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/b5;->g:Ll5/c;

    const-string v0, "eventsCount"

    .line 31
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 32
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/4 v2, 0x7

    .line 33
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/b5;->h:Ll5/c;

    const-string v0, "otherErrors"

    .line 36
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 37
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x8

    .line 38
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/b5;->i:Ll5/c;

    const-string v0, "remoteConfigValueForAcceleration"

    .line 41
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 42
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x9

    .line 43
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/b5;->j:Ll5/c;

    const-string v0, "isAccelerated"

    .line 46
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 47
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0xa

    .line 48
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 50
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/b5;->k:Ll5/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Lw3/w7;

    check-cast p2, Ll5/e;

    sget-object v0, Lw3/b5;->b:Ll5/c;

    .line 2
    invoke-virtual {p1}, Lw3/w7;->e()Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/b5;->c:Ll5/c;

    .line 3
    invoke-virtual {p1}, Lw3/w7;->a()Lw3/c8;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/b5;->d:Ll5/c;

    .line 4
    invoke-virtual {p1}, Lw3/w7;->d()Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/b5;->e:Ll5/c;

    .line 5
    invoke-virtual {p1}, Lw3/w7;->b()Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/b5;->f:Ll5/c;

    .line 6
    invoke-virtual {p1}, Lw3/w7;->c()Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object p1, Lw3/b5;->g:Ll5/c;

    const/4 v0, 0x0

    .line 7
    invoke-interface {p2, p1, v0}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object p1, Lw3/b5;->h:Ll5/c;

    .line 8
    invoke-interface {p2, p1, v0}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object p1, Lw3/b5;->i:Ll5/c;

    .line 9
    invoke-interface {p2, p1, v0}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object p1, Lw3/b5;->j:Ll5/c;

    .line 10
    invoke-interface {p2, p1, v0}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object p1, Lw3/b5;->k:Ll5/c;

    .line 11
    invoke-interface {p2, p1, v0}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    return-void
.end method
