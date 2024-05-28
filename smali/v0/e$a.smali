.class public final Lv0/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/e;)V
    .locals 0

    invoke-direct {p0}, Lv0/e$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)Lt0/m;
    .locals 4

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string v0, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION"

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 1
    invoke-static {p1, v0, v1, v2, v3}, Ljb/c;->e(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lv0/d;->s:Lv0/d$a;

    invoke-virtual {v0, p1, p2}, Lv0/d$a;->a(Ljava/lang/String;Ljava/lang/String;)Lt0/m;

    move-result-object p1

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Lw0/a;

    invoke-direct {v0}, Lw0/a;-><init>()V

    throw v0
    :try_end_0
    .catch Lw0/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    :catch_0
    new-instance v0, Lt0/l;

    invoke-direct {v0, p1, p2}, Lt0/l;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method
