.class public final enum Lu6/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lu6/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum p:Lu6/a;

.field public static final enum q:Lu6/a;

.field public static final enum r:Lu6/a;

.field public static final enum s:Lu6/a;

.field public static final enum t:Lu6/a;

.field private static final synthetic u:[Lu6/a;


# instance fields
.field public final n:Ljava/lang/String;

.field public final o:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Lu6/a;

    const-string v1, "GetPing"

    const/4 v2, 0x0

    const-string v3, "ping.get"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lu6/a;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lu6/a;->p:Lu6/a;

    .line 2
    new-instance v1, Lu6/a;

    const-string v3, "GetConfig"

    const-string v5, "config.get"

    const/4 v6, 0x2

    invoke-direct {v1, v3, v4, v5, v6}, Lu6/a;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v1, Lu6/a;->q:Lu6/a;

    .line 3
    new-instance v3, Lu6/a;

    const-string v5, "PostConfig"

    const-string v7, "config.post"

    const/4 v8, 0x3

    invoke-direct {v3, v5, v6, v7, v8}, Lu6/a;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v3, Lu6/a;->r:Lu6/a;

    .line 4
    new-instance v5, Lu6/a;

    const-string v7, "GetUserAgent"

    const-string v9, "ua.get"

    const/4 v10, 0x4

    invoke-direct {v5, v7, v8, v9, v10}, Lu6/a;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v5, Lu6/a;->s:Lu6/a;

    .line 5
    new-instance v7, Lu6/a;

    const-string v9, "GetDevRpcIpAndPort"

    const-string v11, "devrpc.get"

    const/4 v12, 0x5

    invoke-direct {v7, v9, v10, v11, v12}, Lu6/a;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v7, Lu6/a;->t:Lu6/a;

    new-array v9, v12, [Lu6/a;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    .line 6
    sput-object v9, Lu6/a;->u:[Lu6/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lu6/a;->n:Ljava/lang/String;

    .line 3
    iput p4, p0, Lu6/a;->o:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lu6/a;
    .locals 1

    const-class v0, Lu6/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lu6/a;

    return-object p0
.end method

.method public static values()[Lu6/a;
    .locals 1

    sget-object v0, Lu6/a;->u:[Lu6/a;

    invoke-virtual {v0}, [Lu6/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lu6/a;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;)Landroid/net/Uri;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lu6/a;->c(Ljava/lang/String;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "content://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lu6/a;->n:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p2}, Landroid/content/ContentValues;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 3
    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p1

    invoke-virtual {p2, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    goto :goto_0

    :cond_0
    return-object p1
.end method
