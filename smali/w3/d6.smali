.class final Lw3/d6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll5/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ll5/d<",
        "Lw3/i9;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lw3/d6;

.field private static final b:Ll5/c;

.field private static final c:Ll5/c;

.field private static final d:Ll5/c;

.field private static final e:Ll5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lw3/d6;

    invoke-direct {v0}, Lw3/d6;-><init>()V

    sput-object v0, Lw3/d6;->a:Lw3/d6;

    const-string v0, "inferenceCommonLogEvent"

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

    sput-object v0, Lw3/d6;->b:Ll5/c;

    const-string v0, "imageInfo"

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

    sput-object v0, Lw3/d6;->c:Ll5/c;

    const-string v0, "detectorOptions"

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

    sput-object v0, Lw3/d6;->d:Ll5/c;

    const-string v0, "objectInfos"

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

    sput-object v0, Lw3/d6;->e:Ll5/c;

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

    check-cast p1, Lw3/i9;

    check-cast p2, Ll5/e;

    const/4 p1, 0x0

    throw p1
.end method
