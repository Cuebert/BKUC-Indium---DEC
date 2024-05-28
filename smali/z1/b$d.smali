.class final Lz1/b$d;
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
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ll5/d<",
        "Lz1/l;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lz1/b$d;

.field private static final b:Ll5/c;

.field private static final c:Ll5/c;

.field private static final d:Ll5/c;

.field private static final e:Ll5/c;

.field private static final f:Ll5/c;

.field private static final g:Ll5/c;

.field private static final h:Ll5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lz1/b$d;

    invoke-direct {v0}, Lz1/b$d;-><init>()V

    sput-object v0, Lz1/b$d;->a:Lz1/b$d;

    const-string v0, "eventTimeMs"

    .line 2
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, Lz1/b$d;->b:Ll5/c;

    const-string v0, "eventCode"

    .line 3
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, Lz1/b$d;->c:Ll5/c;

    const-string v0, "eventUptimeMs"

    .line 4
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, Lz1/b$d;->d:Ll5/c;

    const-string v0, "sourceExtension"

    .line 5
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, Lz1/b$d;->e:Ll5/c;

    const-string v0, "sourceExtensionJsonProto3"

    .line 6
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, Lz1/b$d;->f:Ll5/c;

    const-string v0, "timezoneOffsetSeconds"

    .line 7
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, Lz1/b$d;->g:Ll5/c;

    const-string v0, "networkConnectionInfo"

    .line 8
    invoke-static {v0}, Ll5/c;->d(Ljava/lang/String;)Ll5/c;

    move-result-object v0

    sput-object v0, Lz1/b$d;->h:Ll5/c;

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

    check-cast p1, Lz1/l;

    check-cast p2, Ll5/e;

    invoke-virtual {p0, p1, p2}, Lz1/b$d;->b(Lz1/l;Ll5/e;)V

    return-void
.end method

.method public b(Lz1/l;Ll5/e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lz1/b$d;->b:Ll5/c;

    invoke-virtual {p1}, Lz1/l;->c()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ll5/e;->d(Ll5/c;J)Ll5/e;

    .line 2
    sget-object v0, Lz1/b$d;->c:Ll5/c;

    invoke-virtual {p1}, Lz1/l;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    .line 3
    sget-object v0, Lz1/b$d;->d:Ll5/c;

    invoke-virtual {p1}, Lz1/l;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ll5/e;->d(Ll5/c;J)Ll5/e;

    .line 4
    sget-object v0, Lz1/b$d;->e:Ll5/c;

    invoke-virtual {p1}, Lz1/l;->f()[B

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    .line 5
    sget-object v0, Lz1/b$d;->f:Ll5/c;

    invoke-virtual {p1}, Lz1/l;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    .line 6
    sget-object v0, Lz1/b$d;->g:Ll5/c;

    invoke-virtual {p1}, Lz1/l;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ll5/e;->d(Ll5/c;J)Ll5/e;

    .line 7
    sget-object v0, Lz1/b$d;->h:Ll5/c;

    invoke-virtual {p1}, Lz1/l;->e()Lz1/o;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    return-void
.end method
