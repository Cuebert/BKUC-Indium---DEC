.class public abstract Lf6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lh6/a;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Ljava/util/Map;
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lh6/a;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lh6/a;

.field private final c:Lg6/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lh6/a;

    new-instance v1, Ljava/util/EnumMap;

    .line 1
    invoke-direct {v1, v0}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sput-object v1, Lf6/b;->d:Ljava/util/Map;

    new-instance v1, Ljava/util/EnumMap;

    .line 2
    invoke-direct {v1, v0}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sput-object v1, Lf6/b;->e:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lf6/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 2
    :cond_1
    check-cast p1, Lf6/b;

    iget-object v1, p0, Lf6/b;->a:Ljava/lang/String;

    .line 3
    iget-object v3, p1, Lf6/b;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lz2/h;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lf6/b;->b:Lh6/a;

    iget-object v3, p1, Lf6/b;->b:Lh6/a;

    .line 4
    invoke-static {v1, v3}, Lz2/h;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lf6/b;->c:Lg6/l;

    iget-object p1, p1, Lf6/b;->c:Lg6/l;

    .line 5
    invoke-static {v1, p1}, Lz2/h;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lf6/b;->a:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lf6/b;->b:Lh6/a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lf6/b;->c:Lg6/l;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lz2/h;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    const-string v0, "RemoteModel"

    .line 1
    invoke-static {v0}, Lv3/j0;->a(Ljava/lang/String;)Lv3/i0;

    move-result-object v0

    iget-object v1, p0, Lf6/b;->a:Ljava/lang/String;

    const-string v2, "modelName"

    .line 2
    invoke-virtual {v0, v2, v1}, Lv3/i0;->a(Ljava/lang/String;Ljava/lang/Object;)Lv3/i0;

    iget-object v1, p0, Lf6/b;->b:Lh6/a;

    const-string v2, "baseModel"

    .line 3
    invoke-virtual {v0, v2, v1}, Lv3/i0;->a(Ljava/lang/String;Ljava/lang/Object;)Lv3/i0;

    iget-object v1, p0, Lf6/b;->c:Lg6/l;

    const-string v2, "modelType"

    .line 4
    invoke-virtual {v0, v2, v1}, Lv3/i0;->a(Ljava/lang/String;Ljava/lang/Object;)Lv3/i0;

    .line 5
    invoke-virtual {v0}, Lv3/i0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
