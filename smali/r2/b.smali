.class public abstract Lr2/b;
.super Lx2/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx2/e<",
        "Lx2/a$d$c;",
        ">;"
    }
.end annotation


# static fields
.field private static final k:Lx2/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a$g<",
            "Lq3/i;",
            ">;"
        }
    .end annotation
.end field

.field private static final l:Lx2/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a$a<",
            "Lq3/i;",
            "Lx2/a$d$c;",
            ">;"
        }
    .end annotation
.end field

.field private static final m:Lx2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a<",
            "Lx2/a$d$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lx2/a$g;

    invoke-direct {v0}, Lx2/a$g;-><init>()V

    sput-object v0, Lr2/b;->k:Lx2/a$g;

    .line 2
    new-instance v1, Lr2/c;

    invoke-direct {v1}, Lr2/c;-><init>()V

    sput-object v1, Lr2/b;->l:Lx2/a$a;

    .line 3
    new-instance v2, Lx2/a;

    const-string v3, "SmsRetriever.API"

    invoke-direct {v2, v3, v1, v0}, Lx2/a;-><init>(Ljava/lang/String;Lx2/a$a;Lx2/a$g;)V

    sput-object v2, Lr2/b;->m:Lx2/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    sget-object v0, Lr2/b;->m:Lx2/a;

    sget-object v1, Lx2/a$d;->m:Lx2/a$d$c;

    sget-object v2, Lx2/e$a;->c:Lx2/e$a;

    invoke-direct {p0, p1, v0, v1, v2}, Lx2/e;-><init>(Landroid/content/Context;Lx2/a;Lx2/a$d;Lx2/e$a;)V

    return-void
.end method


# virtual methods
.method public abstract y()Lg4/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg4/l<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end method
