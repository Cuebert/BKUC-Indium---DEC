.class public final synthetic Lf8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln1/g;


# instance fields
.field public final synthetic a:Lf8/h;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lf8/h$o;


# direct methods
.method public synthetic constructor <init>(Lf8/h;Ljava/util/List;Lf8/h$o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf8/g;->a:Lf8/h;

    iput-object p2, p0, Lf8/g;->b:Ljava/util/List;

    iput-object p3, p0, Lf8/g;->c:Lf8/h$o;

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/f;Ljava/util/List;)V
    .locals 3

    iget-object v0, p0, Lf8/g;->a:Lf8/h;

    iget-object v1, p0, Lf8/g;->b:Ljava/util/List;

    iget-object v2, p0, Lf8/g;->c:Lf8/h$o;

    invoke-static {v0, v1, v2, p1, p2}, Lf8/h;->e(Lf8/h;Ljava/util/List;Lf8/h$o;Lcom/android/billingclient/api/f;Ljava/util/List;)V

    return-void
.end method
