.class public final Le6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lg6/i;

.field private final b:Lv3/w;


# direct methods
.method public constructor <init>(Lg6/i;)V
    .locals 1

    const-string v0, "common"

    invoke-static {v0}, Lv3/e0;->b(Ljava/lang/String;)Lv3/w;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le6/a;->a:Lg6/i;

    iput-object v0, p0, Le6/a;->b:Lv3/w;

    return-void
.end method
