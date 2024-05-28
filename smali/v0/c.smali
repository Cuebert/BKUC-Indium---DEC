.class public final Lv0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv0/c$a;
    }
.end annotation


# static fields
.field public static final a:Lv0/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv0/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv0/c$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lv0/c;->a:Lv0/c$a;

    return-void
.end method
