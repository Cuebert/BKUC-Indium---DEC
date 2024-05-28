.class public final Lv3/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Lv3/v;

.field private final d:Lg6/n;

.field private final e:Lg4/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg4/l<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lg4/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg4/l<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/lang/String;

.field private final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lg6/n;Lv3/v;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    .line 1
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lv3/w;->h:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    .line 2
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lv3/w;->i:Ljava/util/Map;

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lv3/w;->a:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lg6/c;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lv3/w;->b:Ljava/lang/String;

    iput-object p2, p0, Lv3/w;->d:Lg6/n;

    iput-object p3, p0, Lv3/w;->c:Lv3/v;

    iput-object p4, p0, Lv3/w;->g:Ljava/lang/String;

    .line 5
    invoke-static {}, Lg6/g;->a()Lg6/g;

    move-result-object p1

    new-instance p3, Lv3/u;

    invoke-direct {p3, p4}, Lv3/u;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1, p3}, Lg6/g;->b(Ljava/util/concurrent/Callable;)Lg4/l;

    move-result-object p1

    iput-object p1, p0, Lv3/w;->e:Lg4/l;

    .line 7
    invoke-static {}, Lg6/g;->a()Lg6/g;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p3, Lv3/t;

    invoke-direct {p3, p2}, Lv3/t;-><init>(Lg6/n;)V

    invoke-virtual {p1, p3}, Lg6/g;->b(Ljava/util/concurrent/Callable;)Lg4/l;

    move-result-object p1

    iput-object p1, p0, Lv3/w;->f:Lg4/l;

    return-void
.end method
